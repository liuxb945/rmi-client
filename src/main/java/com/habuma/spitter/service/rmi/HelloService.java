package com.habuma.spitter.service.rmi;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.habuma.spitter.domain.Spittle;
@WebService
public interface HelloService {
	Spittle sayHello(@WebParam(name="name") String name);
}
