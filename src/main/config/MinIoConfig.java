import io.minio.MinioClient;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MinIoConfig  {
    MinioClient minioClient =
		MinioClient.builder()
        .endpoint("https://play.min.io")
        .credentials("Q3AM3UQ867SPQQA43P2F", "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG")
        .build();
}
