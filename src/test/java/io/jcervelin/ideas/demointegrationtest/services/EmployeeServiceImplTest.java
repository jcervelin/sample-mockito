package io.jcervelin.ideas.demointegrationtest.services;

import io.jcervelin.ideas.demointegrationtest.entity.Employee;
import io.jcervelin.ideas.demointegrationtest.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void setupMock() {
        //MockitoAnnotations.initMocks(this);
        employeeService=new EmployeeServiceImpl(employeeRepository);
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        Employee employee = new Employee();
        employee.setName("alex");
        when(employeeRepository.findByName(employee.getName())).thenReturn(employee);
        Employee found = employeeService.getEmployeeByName(employee.getName());

        Assertions.assertThat(found.getName())
                .isEqualTo(employee.getName());
    }
}