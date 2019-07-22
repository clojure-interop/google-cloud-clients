(ns com.google.cloud.compute.deprecated.Operation
  "Google Compute Engine operations. Operation identity can be obtained via getOperationId(). getOperationId() returns GlobalOperationId for global
  operations, RegionOperationId for region operations, and ZoneOperationId for zone
  operations. To get an Operation object with the most recent information, use reload(Compute.OperationOption...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Operation]))

(defn get-errors
  "Returns the errors encountered while processing this operation, if any. Returns null if
   no error occurred.

  returns: `java.util.List<com.google.cloud.compute.deprecated.Operation$OperationError>`"
  (^java.util.List [^Operation this]
    (-> this (.getErrors))))

(defn get-insert-time
  "Returns the time that this operation was requested. In milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Operation this]
    (-> this (.getInsertTime))))

(defn get-http-error-message
  "Returns the the HTTP error message that was returned, if the operation failed. For example, a
   NOT FOUND message is returned if the resource was not found.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getHttpErrorMessage))))

(defn delete
  "Deletes this operation. Delete is only possible for operations that have completed their
   execution. Any attempt to delete a running operation will fail.

  returns: true if operation was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Operation this]
    (-> this (.delete))))

(defn get-status
  "Returns the status of the operation.

  returns: `com.google.cloud.compute.deprecated.Operation$Status`"
  (^com.google.cloud.compute.deprecated.Operation$Status [^Operation this]
    (-> this (.getStatus))))

(defn get-start-time
  "Returns the time that this operation was started by the service. In milliseconds since epoch.
   This value will be null if the operation has not started yet.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Operation this]
    (-> this (.getStartTime))))

(defn get-http-error-status-code
  "Returns the HTTP error status code that was returned, if the operation failed. For example, a
   404 means the resource was not found.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation this]
    (-> this (.getHttpErrorStatusCode))))

(defn get-target-link
  "Returns the URL of the resource that the operation is modifying.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getTargetLink))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.toString))))

(defn get-warnings
  "Returns the warnings encountered while processing this operation, if any. Returns null
   if no warning occurred.

  returns: `java.util.List<com.google.cloud.compute.deprecated.Operation$OperationWarning>`"
  (^java.util.List [^Operation this]
    (-> this (.getWarnings))))

(defn get-progress
  "Returns an optional progress indicator that ranges from 0 to 100. There is no requirement that
   this be linear or support any granularity of operations. This should not be used to guess when
   the operation will be complete. This number should monotonically increase as the operation
   progresses.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation this]
    (-> this (.getProgress))))

(defn get-operation-id
  "Returns the operation's identity. This method returns an GlobalOperationId for global
   operations, a RegionOperationId for region operations and a ZoneOperationId for
   zone operations.

  returns: `<T extends com.google.cloud.compute.deprecated.OperationId> T`"
  ([^Operation this]
    (-> this (.getOperationId))))

(defn get-compute
  "Returns the operation's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Operation this]
    (-> this (.getCompute))))

(defn get-user
  "Returns the user who requested the operation, for example: user@example.com.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getUser))))

(defn get-description
  "Returns an optional textual description of the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getDescription))))

(defn reload
  "Fetches current operation's latest information. Returns null if the operation does not
   exist.

  options - operation options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an Operation object with latest information or null if not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Operation this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.reload options))))

(defn get-end-time
  "Returns the time that this operation was completed. In milliseconds since epoch. This value
   will be null if the operation has not finished yet.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Operation this]
    (-> this (.getEndTime))))

(defn done?
  "Checks if this operation has completed its execution, either failing or succeeding. If the
   operation does not exist this method returns true. You can wait for operation
   completion with:



   while(!operation.isDone()) {
     Thread.sleep(1000L);
   }

  returns: true if this operation is in Operation.Status.DONE state or if it does
       not exist, false if the state is not Operation.Status.DONE - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Operation this]
    (-> this (.isDone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Operation this]
    (-> this (.hashCode))))

(defn exists?
  "Checks if this operation exists.

  returns: true if this operation exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Operation this]
    (-> this (.exists))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getGeneratedId))))

(defn get-target-id
  "Returns the unique service-defined target ID, which identifies the resource that the operation
   is modifying.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getTargetId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Operation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-status-message
  "Returns an optional textual description of the current status of the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getStatusMessage))))

(defn wait-for
  "Blocks until this operation completes its execution, either failing or succeeding. This method
   returns current operation's latest information. If the operation no longer exists, this method
   returns null. By default, the operation status is checked using jittered exponential
   backoff with 1 second as an initial delay, 2.0 as a backoff factor, 1 minute as maximum delay
   between polls, 12 hours as a total timeout and unlimited number of attempts.

   Example usage of waitFor():



   Operation completedOperation = operation.waitFor();
   if (completedOperation == null) {
     // operation no longer exists
   } else if (completedOperation.errors() != null) {
     // operation failed, handle error
   } else {
     // operation completed successfully
   }

   Example usage of waitFor() with checking period and timeout:



   Operation completedOperation =
       operation.waitFor(
           RetryOption.maxRetryDelay(Duration.ofSeconds(30)),
           RetryOption.totalTimeout(Duration.ofMinutes(1)),
           RetryOption.jittered(false));
   if (completedOperation == null) {
     // operation no longer exists
   } else if (completedOperation.errors() != null) {
     // operation failed, handle error
   } else {
     // operation completed successfully
   }

  wait-options - options to configure checking period and timeout - `com.google.cloud.RetryOption`

  returns: `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure, check Throwable.getCause() for details"
  (^com.google.cloud.compute.deprecated.Operation [^Operation this ^com.google.cloud.RetryOption wait-options]
    (-> this (.waitFor wait-options))))

(defn get-operation-type
  "Returns the type of operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getOperationType))))

