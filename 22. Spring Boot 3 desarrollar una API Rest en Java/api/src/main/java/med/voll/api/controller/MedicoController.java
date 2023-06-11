package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.RouterFunctionDsl;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        System.out.println("El request llega correctamente");
        System.out.println(datosRegistroMedico);
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public Page<DatosListadoMedico> listaMedicos(@PageableDefault(size = 2) Pageable paginacion){
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
        //return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizarMedico) {
        Medico medico = medicoRepository.getReferenceById(datosActualizarMedico.id());
        medico.actualizarDatos(datosActualizarMedico);
    }

    // DELETE LOGICO
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        medico.desactivarMedico();
    }

    // DELETE EN BD
    /*@DeleteMapping("{id}")
    @Transactional
    public void eliminarMedico(@PathVariable long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medicoRepository.delete(medico);
    }*/

}
