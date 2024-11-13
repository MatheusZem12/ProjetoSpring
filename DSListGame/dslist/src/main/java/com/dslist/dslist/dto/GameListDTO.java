package com.dslist.dslist.dto;

import com.dslist.dslist.entity.GameList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;
    public GameListDTO(GameList gameList){
        BeanUtils.copyProperties(gameList,this);
    }
}
