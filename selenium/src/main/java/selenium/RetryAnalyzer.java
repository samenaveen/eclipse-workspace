    package selenium;

    import org.testng.IRetryAnalyzer;
    import org.testng.ITestResult;

    public class RetryAnalyzer implements IRetryAnalyzer {

        private int retryCount = 0;
        private int maxRetryCount = 3; // You can set the maximum retry count here

        @Override
        public boolean retry(ITestResult result) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                return true; // Retry the test
            }
            return false; // Do not retry the test
        }
    }


