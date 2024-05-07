package fr.tln.univ.bank_management_system.dto.client;

import fr.tln.univ.bank_management_system.dto.base.ViewBaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ViewClientDto extends ViewBaseDto {
    private List<Integer> accountList;
}
