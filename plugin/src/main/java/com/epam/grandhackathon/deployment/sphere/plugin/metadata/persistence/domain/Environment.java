package com.epam.grandhackathon.deployment.sphere.plugin.metadata.persistence.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data
public class Environment implements Serializable {
    private String key;
    private String title;

    private List<Deployment> deployments;

}
