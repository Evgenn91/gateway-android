package com.github.Evgenn91.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PledgeFullInformations implements Serializable {
    private static final long serialVersionUID = -563401086753807063L;

    private List<PledgeFullInformation> pledgeFullInformationList;

    public PledgeFullInformations() {
        pledgeFullInformationList = new ArrayList<>();
    }

    public PledgeFullInformations(List<PledgeFullInformation> pledgeFullInformationList) {
        this.pledgeFullInformationList = pledgeFullInformationList;
    }

    public void add(PledgeFullInformation pledge){
        this.pledgeFullInformationList.add(pledge);
    }
}
