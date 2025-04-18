package com.insurance.dao;

import com.insurance.model.Policy;

import java.util.List;

public interface IPolicyDao {
	
    public void addPolicy(Policy policy);
    
    Policy getPolicy(int policyId);
    
    List<Policy> getAllPolicies();
    
    public void updatePolicy(int policyId,double premium);
    
    boolean deletePolicy(int policyId);

}