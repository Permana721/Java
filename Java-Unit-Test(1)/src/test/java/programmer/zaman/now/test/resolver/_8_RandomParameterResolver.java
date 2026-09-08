package programmer.zaman.now.test.resolver;

import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.util.Random;

/*
Tidak ada magic di JUnit, sebenarnya fitur TestInfo yang sebelumnya kita bahas adalah bagian dari
dependency injection di JUnit
Dependency Injection sederhananya adalah bagaimana kita bisa memasukkan dependency
(object/instance) ke dalam unit test secara otomatis tanpa proses manual
Saat kita menambah parameter di function unit test,
sebenarnya kita bisa secara otomatis memasukkan parameter tersebut dengan bantuan ParameterResolver
Contohnya TestInfo yang kita bahas sebelumya, sebenarnya objectnya dibuat oleh TestInfoParameterResolver
 */

public class _8_RandomParameterResolver implements ParameterResolver {

    private Random random = new Random();

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Random.class;
    }

    @Override
    public @Nullable Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return random;
    }
}
