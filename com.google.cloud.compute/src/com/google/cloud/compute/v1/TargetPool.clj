(ns com.google.cloud.compute.v1.TargetPool
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPool]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPool`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^com.google.cloud.compute.v1.TargetPool prototype]
    (TargetPool/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPool$Builder []
    (TargetPool/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPool`"
  (^com.google.cloud.compute.v1.TargetPool []
    (TargetPool/getDefaultInstance )))

(defn get-session-affinity
  "Session affinity option, must be one of the following values: NONE: Connections from the same
   client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO:
   Connections from the same client IP with the same IP protocol will go to the same instance in
   the pool while that instance remains healthy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getSessionAffinity))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#targetPool for target pools.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPool this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPool this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getName))))

(defn get-health-checks-list
  "The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   if and only if the health checks pass. An empty list means all member instances will be
   considered healthy at all times. Only HttpHealthChecks are supported. Only one health check may
   be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPool this]
    (-> this (.getHealthChecksList))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPool this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getSelfLink))))

(defn get-failover-ratio
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool (i.e., not as a backup pool to some other target pool). The value of the field
   must be in [0, 1].

   If set, backupPool must also be set. They together define the fallback behavior of the
   primary target pool: if the ratio of the healthy instances in the primary pool is at or below
   this number, traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio is not set or all the instances in the backup pool are
   unhealthy, the traffic will be directed back to the primary pool in the \"force\" mode, where
   traffic will be spread to the healthy instances with the best effort, or to all instances when
   no instance is healthy.

  returns: `java.lang.Float`"
  (^java.lang.Float [^TargetPool this]
    (-> this (.getFailoverRatio))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPool this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getCreationTimestamp))))

(defn get-instances-list
  "A list of resource URLs to the virtual machine instances serving this pool. They must live in
   zones contained in the same region as this pool.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPool this]
    (-> this (.getInstancesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPool this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-backup-pool
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool, and its failoverRatio field is properly set to a value between [0, 1].

   backupPool and failoverRatio together define the fallback behavior of the primary target
   pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio,
   traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio and backupPool are not set, or all the instances in the backup
   pool are unhealthy, the traffic will be directed back to the primary pool in the \"force\" mode,
   where traffic will be spread to the healthy instances with the best effort, or to all instances
   when no instance is healthy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getBackupPool))))

(defn get-region
  "[Output Only] URL of the region where the target pool resides.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool this]
    (-> this (.toBuilder))))

