(ns com.google.cloud.compute.v1.Operation$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Operation$Builder]))

(defn get-client-operation-id
  "[Output Only] The value of `requestId` if you provided it in the request. Not present
   otherwise.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getClientOperationId))))

(defn set-progress
  "[Output Only] An optional progress indicator that ranges from 0 to 100. There is no
   requirement that this be linear or support any granularity of operations. This should not be
   used to guess when the operation will be complete. This number should monotonically increase
   as the operation progresses.

  progress - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.Integer progress]
    (-> this (.setProgress progress))))

(defn set-description
  "[Output Only] A textual description of the operation, which is set when the operation is
   created.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-target-id
  "[Output Only] The unique target ID, which identifies a specific incarnation of the target
   resource.

  target-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String target-id]
    (-> this (.setTargetId target-id))))

(defn set-region
  "[Output Only] The URL of the region where the operation resides. Only available when
   performing regional operations. You must specify this field as part of the HTTP request URL.
   It is not settable as a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Deprecated] This field is deprecated.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-target-link
  "[Output Only] The URL of the resource that the operation modifies. For operations related to
   creating a snapshot, this points to the persistent disk that the snapshot was created from.

  target-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String target-link]
    (-> this (.setTargetLink target-link))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#operation for Operation resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getKind))))

(defn get-insert-time
  "[Output Only] The time that this operation was requested. This value is in RFC3339 text
   format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getInsertTime))))

(defn get-http-error-message
  "[Output Only] If the operation fails, this field contains the HTTP error message that was
   returned, such as NOT FOUND.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getHttpErrorMessage))))

(defn get-status
  "[Output Only] The status of the operation, which can be one of the following: PENDING,
   RUNNING, or DONE.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getStatus))))

(defn add-all-warnings
  "[Output Only] If warning messages are generated during processing of the operation, this
   field will be populated.

  warnings - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.util.List warnings]
    (-> this (.addAllWarnings warnings))))

(defn get-start-time
  "[Output Only] The time that this operation was started by the server. This value is in
   RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getStartTime))))

(defn get-http-error-status-code
  "[Output Only] If the operation fails, this field contains the HTTP error status code that was
   returned. For example, a 404 means the resource was not found.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation$Builder this]
    (-> this (.getHttpErrorStatusCode))))

(defn set-operation-type
  "[Output Only] The type of operation, such as insert, update, or delete, and so on.

  operation-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String operation-type]
    (-> this (.setOperationType operation-type))))

(defn get-target-link
  "[Output Only] The URL of the resource that the operation modifies. For operations related to
   creating a snapshot, this points to the persistent disk that the snapshot was created from.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getTargetLink))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-client-operation-id
  "[Output Only] The value of `requestId` if you provided it in the request. Not present
   otherwise.

  client-operation-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String client-operation-id]
    (-> this (.setClientOperationId client-operation-id))))

(defn set-error
  "[Output Only] If errors are generated during processing of the operation, this field will be
   populated.

  error - `com.google.cloud.compute.v1.Error`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^com.google.cloud.compute.v1.Error error]
    (-> this (.setError error))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#operation for Operation resources.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-progress
  "[Output Only] An optional progress indicator that ranges from 0 to 100. There is no
   requirement that this be linear or support any granularity of operations. This should not be
   used to guess when the operation will be complete. This number should monotonically increase
   as the operation progresses.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Operation$Builder this]
    (-> this (.getProgress))))

(defn set-start-time
  "[Output Only] The time that this operation was started by the server. This value is in
   RFC3339 text format.

  start-time - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String start-time]
    (-> this (.setStartTime start-time))))

(defn get-error
  "[Output Only] If errors are generated during processing of the operation, this field will be
   populated.

  returns: `com.google.cloud.compute.v1.Error`"
  (^com.google.cloud.compute.v1.Error [^Operation$Builder this]
    (-> this (.getError))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-user
  "[Output Only] User who requested the operation, for example: user@example.com.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getUser))))

(defn build
  "returns: `com.google.cloud.compute.v1.Operation`"
  (^com.google.cloud.compute.v1.Operation [^Operation$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] A textual description of the operation, which is set when the operation is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getDescription))))

(defn set-end-time
  "[Output Only] The time that this operation was completed. This value is in RFC3339 text
   format.

  end-time - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String end-time]
    (-> this (.setEndTime end-time))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn add-warnings
  "[Output Only] If warning messages are generated during processing of the operation, this
   field will be populated.

  warnings - `com.google.cloud.compute.v1.Warnings`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^com.google.cloud.compute.v1.Warnings warnings]
    (-> this (.addWarnings warnings))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Operation`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^com.google.cloud.compute.v1.Operation other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The URL of the zone where the operation resides. Only available when performing
   per-zone operations. You must specify this field as part of the HTTP request URL. It is not
   settable as a field in the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If warning messages are generated during processing of the operation, this
   field will be populated.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^Operation$Builder this]
    (-> this (.getWarningsList))))

(defn get-zone
  "[Output Only] The URL of the zone where the operation resides. Only available when performing
   per-zone operations. You must specify this field as part of the HTTP request URL. It is not
   settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getZone))))

(defn set-http-error-status-code
  "[Output Only] If the operation fails, this field contains the HTTP error status code that was
   returned. For example, a 404 means the resource was not found.

  http-error-status-code - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.Integer http-error-status-code]
    (-> this (.setHttpErrorStatusCode http-error-status-code))))

(defn set-user
  "[Output Only] User who requested the operation, for example: user@example.com.

  user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String user]
    (-> this (.setUser user))))

(defn get-end-time
  "[Output Only] The time that this operation was completed. This value is in RFC3339 text
   format.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getEndTime))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this]
    (-> this (.clone))))

(defn set-insert-time
  "[Output Only] The time that this operation was requested. This value is in RFC3339 text
   format.

  insert-time - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String insert-time]
    (-> this (.setInsertTime insert-time))))

(defn get-creation-timestamp
  "[Deprecated] This field is deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-http-error-message
  "[Output Only] If the operation fails, this field contains the HTTP error message that was
   returned, such as NOT FOUND.

  http-error-message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String http-error-message]
    (-> this (.setHttpErrorMessage http-error-message))))

(defn get-target-id
  "[Output Only] The unique target ID, which identifies a specific incarnation of the target
   resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getTargetId))))

(defn get-status-message
  "[Output Only] An optional textual description of the current status of the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getStatusMessage))))

(defn set-status
  "[Output Only] The status of the operation, which can be one of the following: PENDING,
   RUNNING, or DONE.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn set-status-message
  "[Output Only] An optional textual description of the current status of the operation.

  status-message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation$Builder`"
  (^com.google.cloud.compute.v1.Operation$Builder [^Operation$Builder this ^java.lang.String status-message]
    (-> this (.setStatusMessage status-message))))

(defn get-region
  "[Output Only] The URL of the region where the operation resides. Only available when
   performing regional operations. You must specify this field as part of the HTTP request URL.
   It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getRegion))))

(defn get-operation-type
  "[Output Only] The type of operation, such as insert, update, or delete, and so on.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$Builder this]
    (-> this (.getOperationType))))

