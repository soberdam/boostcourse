package kr.or.connect.daoexam.dao;

public class RoleDalSqls {
	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_id";
	public static final String UPDATE = "UPDATE role SET description = :description WHERE ROLE_ID = :roleId";
	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :roleId";
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";
}