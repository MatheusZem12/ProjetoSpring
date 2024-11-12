package com.dslist.dslist.dto;

import com.dslist.dslist.entity.Games;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class GameMinDTO {
    private Long id;
    private String title;
    private String shortDescription;
    private String imgUrl;
    private Integer launchYear;

    public GameMinDTO(Games games){
        id = games.getId();
        title = games.getTitle();
        shortDescription = games.getShortDescription();
        imgUrl = games.getImgUrl();
        launchYear = games.getLaunchYear();
    }
}
