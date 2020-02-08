package com.explore.springboot.majorFoucsList.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MmDishonestyList {
    private String id;
    /**
     * 操作流水号
     */
    private String operateNumber;
    /**
     * 流程节点id
     */
    private String processExampleId;
    /**
     * 流程状态
     (01进入待提交 02进入待审批 03进入审批通过  04进入审批不通过
     05 退出待提交 06退出待审批 07退出审批通过  08退出审批不通过）
     */
    private String processStatus;
    /**
     * 市场主体id
     */
    private String participantId;
    /**
     * 名单类型（1黑名单，2重点关注名单）
     */
    private String undueCost;
    /**
     * 操作类型（01进入 02退出）
     */
    private String operateType;
    /**
     * 失信原因（1政府发文，2信用过低）
     */
    private String dishonestyReason;
    /**
     * 进入证明材料（附件id）
     */
    private String enterFile;
    /**
     * 生效时间
     */
    private LocalDateTime startDate;
    /**
     * 退出证明材料
     */
    private String quitFile;
    /**
     * 失效时间
     */
    private LocalDateTime endDate;
    /**
     * 是否生效(1生效，2失效)
     */
    private String isEffect;
    /**
     * 处理时间
     */
    private LocalDateTime procesDate;
    /**
     * 编制人
     */
    private String compilingPerson;
    /**
     * 编制时间
     */
    private LocalDateTime compileTime;
    /**
     * 场景id
     */
    private String marketId;
    /**
     * 详情说明
     */
    private String detail;
    /**
     * 处理方式(1退市，2停牌)
     */
    private String processMode;
    /**
     * 停牌开始时间
     */
    private String alsoStartdate;
    /**
     * 停牌结束时间
     */
    private String alsoEnddate;



}
