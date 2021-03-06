package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8Project;

public interface Ku8ProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_project
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ku8_project",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_project
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ku8_project (ID, TENANT_ID, ",
        "OWNER, NAME, ICON_URL, ",
        "VERSION, K8S_VERSION, APP_TYPE, ",
        "ZONE_ID, CLUSTER_ID, ",
        "RES_PARTION_ID, JSON_SPEC, ",
        "PREV_JSON_SPEC, STATUS, ",
        "NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{tenantId,jdbcType=INTEGER}, ",
        "#{owner,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{iconUrl,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=CHAR}, #{k8sVersion,jdbcType=CHAR}, #{appType,jdbcType=TINYINT}, ",
        "#{zoneId,jdbcType=INTEGER}, #{clusterId,jdbcType=INTEGER}, ",
        "#{resPartionId,jdbcType=INTEGER}, #{jsonSpec,jdbcType=VARCHAR}, ",
        "#{prevJsonSpec,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Ku8Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_project
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, K8S_VERSION, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, JSON_SPEC, PREV_JSON_SPEC, STATUS, NOTE, LAST_UPDATED",
        "from ku8_project",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="K8S_VERSION", property="k8sVersion", jdbcType=JdbcType.CHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Ku8Project selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_project
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, K8S_VERSION, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, JSON_SPEC, PREV_JSON_SPEC, STATUS, NOTE, LAST_UPDATED",
        "from ku8_project"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="K8S_VERSION", property="k8sVersion", jdbcType=JdbcType.CHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Ku8Project> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_project
     *
     * @mbggenerated
     */
    @Update({
        "update ku8_project",
        "set TENANT_ID = #{tenantId,jdbcType=INTEGER},",
          "OWNER = #{owner,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "ICON_URL = #{iconUrl,jdbcType=VARCHAR},",
          "VERSION = #{version,jdbcType=CHAR},",
          "K8S_VERSION = #{k8sVersion,jdbcType=CHAR},",
          "APP_TYPE = #{appType,jdbcType=TINYINT},",
          "ZONE_ID = #{zoneId,jdbcType=INTEGER},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "RES_PARTION_ID = #{resPartionId,jdbcType=INTEGER},",
          "JSON_SPEC = #{jsonSpec,jdbcType=VARCHAR},",
          "PREV_JSON_SPEC = #{prevJsonSpec,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ku8Project record);
}