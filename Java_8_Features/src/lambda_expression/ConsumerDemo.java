package lambda_expression;

import java.util.function.Predicate;

public class ConsumerDemo implements Predicate<Employee2> {

    @Override
    public boolean test(Employee2 e) {
        return e.getSalary() > 50000;
    }
}
