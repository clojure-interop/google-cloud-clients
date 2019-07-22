(ns com.google.cloud.spanner.SpannerExceptionFactory
  "A factory for creating instances of SpannerException and its subtypes. All creation of
  these exceptions is directed through the factory. This ensures that particular types of errors
  are always expressed as the same concrete exception type. For example, exceptions of type ErrorCode.ABORTED are always represented by AbortedException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SpannerExceptionFactory]))

(defn ->spanner-exception-factory
  "Constructor."
  (^SpannerExceptionFactory []
    (new SpannerExceptionFactory )))

(defn *new-spanner-exception
  "Creates a new exception based on cause. If cause indicates cancellation, context will be inspected to establish the type of cancellation.

   Intended for internal library use; user code should use newSpannerException(ErrorCode, String) instead of this method.

  context - `io.grpc.Context`
  cause - `java.lang.Throwable`

  returns: `com.google.cloud.spanner.SpannerException`"
  (^com.google.cloud.spanner.SpannerException [^io.grpc.Context context ^java.lang.Throwable cause]
    (SpannerExceptionFactory/newSpannerException context cause))
  (^com.google.cloud.spanner.SpannerException [^java.lang.Throwable cause]
    (SpannerExceptionFactory/newSpannerException cause))
  (^com.google.cloud.spanner.SpannerException [^com.google.cloud.spanner.ErrorCode code ^java.lang.String message ^java.lang.Throwable cause]
    (SpannerExceptionFactory/newSpannerException code message cause)))

(defn *propagate-interrupt
  "e - `java.lang.InterruptedException`

  returns: `com.google.cloud.spanner.SpannerException`"
  (^com.google.cloud.spanner.SpannerException [^java.lang.InterruptedException e]
    (SpannerExceptionFactory/propagateInterrupt e)))

(defn *propagate-timeout
  "Transforms a TimeoutException to a SpannerException.



   try {
     Spanner spanner = SpannerOptions.getDefaultInstance();
     spanner
         .getDatabaseAdminClient()
         .createDatabase(\"[INSTANCE_ID]\", \"[DATABASE_ID]\", [STATEMENTS])
         .get();
   } catch (TimeoutException e) {
     propagateTimeout(e);
   }

  e - `java.util.concurrent.TimeoutException`

  returns: `com.google.cloud.spanner.SpannerException`"
  (^com.google.cloud.spanner.SpannerException [^java.util.concurrent.TimeoutException e]
    (SpannerExceptionFactory/propagateTimeout e)))

(defn *new-spanner-batch-update-exception
  "code - `com.google.cloud.spanner.ErrorCode`
  message - `java.lang.String`
  update-counts - `long[]`

  returns: `com.google.cloud.spanner.SpannerBatchUpdateException`"
  (^com.google.cloud.spanner.SpannerBatchUpdateException [^com.google.cloud.spanner.ErrorCode code ^java.lang.String message update-counts]
    (SpannerExceptionFactory/newSpannerBatchUpdateException code message update-counts)))

