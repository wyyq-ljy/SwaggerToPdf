package com.gdpt.cloudService.pojo;

import java.sql.Date;

public class Robot {

    private int robotId;

    private String name;

    private String brand;

    private String model;

    private String productionDate;

    private int status;

    private Date dateTime;
      /*`robot_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '机器人编号id',
            `name` varchar(200) NOT NULL COMMENT '机器人名称',
            `brand` varchar(200) NOT NULL COMMENT '品牌',
            `model` varchar(200) NOT NULL COMMENT '型号',
            `production_date` datetime NOT NULL COMMENT '生产日期',
            `status` tinyint(1) NOT NULL COMMENT '状态（1 正常/ 2 故障/ 3 报废）',
            `register_date` datetime NOT NULL COMMENT '注册时间',
*/

    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Robot(String name, String brand, String model, String productionDate, int status) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.status = status;
    }

    public Robot(String name, String brand, String model, String productionDate, int status, Date dateTime) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.status = status;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotId=" + robotId +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionDate=" + productionDate +
                ", status=" + status +
                ", dateTime=" + dateTime +
                '}';
    }
}
