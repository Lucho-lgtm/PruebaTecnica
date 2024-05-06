package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public List<ProviderDTO> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{id}")
    public ProviderDTO getProviderById(@PathVariable Long id) {
        return providerService.getProviderById(id);
    }

    @PostMapping
    public ProviderDTO createProvider(@RequestBody ProviderDTO providerDTO) {
        return providerService.createProvider(providerDTO);
    }

    @PutMapping("/{id}")
    public ProviderDTO updateProvider(@PathVariable Long id, @RequestBody ProviderDTO providerDTO) {
        return providerService.updateProvider(id, providerDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable Long id) {
        providerService.deleteProvider(id);
    }
}
