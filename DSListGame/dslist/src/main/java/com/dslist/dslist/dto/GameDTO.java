package com.dslist.dslist.dto;


import com.dslist.dslist.entity.Games;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private Long id;
    private String title;
    private String genre;
    private String shortDescription;
    private String longDescription;
    private String platform;
    private String imgUrl;
    private Integer launchYear;
    private Double score;

    public GameDTO(Games games) {
        BeanUtils.copyProperties(games,this);
    }
}
