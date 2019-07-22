(ns com.google.cloud.compute.v1.Operation
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Operation]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Operation`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^com.google.cloud.compute.v1.Operation prototype]
    (Operation/newBuilder prototype))
  (^com.google.cloud.compute.v1.Operation$Builder []
    (Operation/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Operation`"
  (^com.google.cloud.compute.v1.Operation []
    (Operation/getDefaultInstance )))

(defn get-client-operation-id
  "[Output Only] The value of `requestId` if you provided it in the request. Not present
   otherwise.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getClientOperationId))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#operation for Operation resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getKind))))

(defn get-insert-time
  "[Output Only] The time that this operation was requested. This value is in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getInsertTime))))

(defn get-http-error-message
  "[Output Only] If the operation fails, this field contains the HTTP error message that was
   returned, such as NOT FOUND.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getHttpErrorMessage))))

(defn get-status
  "[Output Only] The status of the operation, which can be one of the following: PENDING, RUNNING,
   or DONE.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getStatus))))

(defn get-start-time
  "[Output Only] The time that this operation was started by the server. This value is in RFC3339
   text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getStartTime))))

(defn get-http-error-status-code
  "[Output Only] If the operation fails, this field contains the HTTP error status code that was
   returned. For example, a 404 means the resource was not found.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation this]
    (-> this (.getHttpErrorStatusCode))))

(defn get-target-link
  "[Output Only] The URL of the resource that the operation modifies. For operations related to
   creating a snapshot, this points to the persistent disk that the snapshot was created from.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getTargetLink))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Operation this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Operation this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-progress
  "[Output Only] An optional progress indicator that ranges from 0 to 100. There is no requirement
   that this be linear or support any granularity of operations. This should not be used to guess
   when the operation will be complete. This number should monotonically increase as the operation
   progresses.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation this]
    (-> this (.getProgress))))

(defn get-error
  "[Output Only] If errors are generated during processing of the operation, this field will be
   populated.

  returns: `com.google.cloud.compute.v1.Error`"
  (^com.google.cloud.compute.v1.Error [^Operation this]
    (-> this (.getError))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getName))))

(defn get-user
  "[Output Only] User who requested the operation, for example: user@example.com.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getUser))))

(defn get-description
  "[Output Only] A textual description of the operation, which is set when the operation is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Operation this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If warning messages are generated during processing of the operation, this field
   will be populated.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^Operation this]
    (-> this (.getWarningsList))))

(defn get-zone
  "[Output Only] The URL of the zone where the operation resides. Only available when performing
   per-zone operations. You must specify this field as part of the HTTP request URL. It is not
   settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getZone))))

(defn get-end-time
  "[Output Only] The time that this operation was completed. This value is in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getEndTime))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Operation this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Deprecated] This field is deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getCreationTimestamp))))

(defn get-target-id
  "[Output Only] The unique target ID, which identifies a specific incarnation of the target
   resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getTargetId))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Operation this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-status-message
  "[Output Only] An optional textual description of the current status of the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getStatusMessage))))

(defn get-region
  "[Output Only] The URL of the region where the operation resides. Only available when performing
   regional operations. You must specify this field as part of the HTTP request URL. It is not
   settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getRegion))))

(defn get-operation-type
  "[Output Only] The type of operation, such as insert, update, or delete, and so on.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getOperationType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation this]
    (-> this (.toBuilder))))

