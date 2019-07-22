(ns com.google.cloud.compute.v1.TargetPool$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPool$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URL of the region where the target pool resides.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-session-affinity
  "Session affinity option, must be one of the following values: NONE: Connections from the same
   client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   will go to the same instance in the pool while that instance remains healthy.
   CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the
   same instance in the pool while that instance remains healthy.

  session-affinity - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String session-affinity]
    (-> this (.setSessionAffinity session-affinity))))

(defn get-session-affinity
  "Session affinity option, must be one of the following values: NONE: Connections from the same
   client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   will go to the same instance in the pool while that instance remains healthy.
   CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the
   same instance in the pool while that instance remains healthy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getSessionAffinity))))

(defn add-all-instances
  "A list of resource URLs to the virtual machine instances serving this pool. They must live in
   zones contained in the same region as this pool.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#targetPool for target pools.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-health-checks
  "The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   if and only if the health checks pass. An empty list means all member instances will be
   considered healthy at all times. Only HttpHealthChecks are supported. Only one health check
   may be specified.

  health-checks - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String health-checks]
    (-> this (.addHealthChecks health-checks))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#targetPool for target pools.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-failover-ratio
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool (i.e., not as a backup pool to some other target pool). The value of the
   field must be in [0, 1].

   If set, backupPool must also be set. They together define the fallback behavior of the
   primary target pool: if the ratio of the healthy instances in the primary pool is at or below
   this number, traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio is not set or all the instances in the backup pool are
   unhealthy, the traffic will be directed back to the primary pool in the \"force\" mode, where
   traffic will be spread to the healthy instances with the best effort, or to all instances
   when no instance is healthy.

  failover-ratio - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.Float failover-ratio]
    (-> this (.setFailoverRatio failover-ratio))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-health-checks-list
  "The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   if and only if the health checks pass. An empty list means all member instances will be
   considered healthy at all times. Only HttpHealthChecks are supported. Only one health check
   may be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPool$Builder this]
    (-> this (.getHealthChecksList))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPool`"
  (^com.google.cloud.compute.v1.TargetPool [^TargetPool$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPool`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^com.google.cloud.compute.v1.TargetPool other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getSelfLink))))

(defn add-all-health-checks
  "The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   if and only if the health checks pass. An empty list means all member instances will be
   considered healthy at all times. Only HttpHealthChecks are supported. Only one health check
   may be specified.

  health-checks - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.util.List health-checks]
    (-> this (.addAllHealthChecks health-checks))))

(defn get-failover-ratio
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool (i.e., not as a backup pool to some other target pool). The value of the
   field must be in [0, 1].

   If set, backupPool must also be set. They together define the fallback behavior of the
   primary target pool: if the ratio of the healthy instances in the primary pool is at or below
   this number, traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio is not set or all the instances in the backup pool are
   unhealthy, the traffic will be directed back to the primary pool in the \"force\" mode, where
   traffic will be spread to the healthy instances with the best effort, or to all instances
   when no instance is healthy.

  returns: `java.lang.Float`"
  (^java.lang.Float [^TargetPool$Builder this]
    (-> this (.getFailoverRatio))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this]
    (-> this (.clone))))

(defn add-instances
  "A list of resource URLs to the virtual machine instances serving this pool. They must live in
   zones contained in the same region as this pool.

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-instances-list
  "A list of resource URLs to the virtual machine instances serving this pool. They must live in
   zones contained in the same region as this pool.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPool$Builder this]
    (-> this (.getInstancesList))))

(defn set-backup-pool
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool, and its failoverRatio field is properly set to a value between [0, 1].

   backupPool and failoverRatio together define the fallback behavior of the primary target
   pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio,
   traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio and backupPool are not set, or all the instances in the backup
   pool are unhealthy, the traffic will be directed back to the primary pool in the \"force\"
   mode, where traffic will be spread to the healthy instances with the best effort, or to all
   instances when no instance is healthy.

  backup-pool - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPool$Builder`"
  (^com.google.cloud.compute.v1.TargetPool$Builder [^TargetPool$Builder this ^java.lang.String backup-pool]
    (-> this (.setBackupPool backup-pool))))

(defn get-backup-pool
  "This field is applicable only when the containing target pool is serving a forwarding rule as
   the primary pool, and its failoverRatio field is properly set to a value between [0, 1].

   backupPool and failoverRatio together define the fallback behavior of the primary target
   pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio,
   traffic arriving at the load-balanced IP will be directed to the backup pool.

   In case where failoverRatio and backupPool are not set, or all the instances in the backup
   pool are unhealthy, the traffic will be directed back to the primary pool in the \"force\"
   mode, where traffic will be spread to the healthy instances with the best effort, or to all
   instances when no instance is healthy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getBackupPool))))

(defn get-region
  "[Output Only] URL of the region where the target pool resides.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPool$Builder this]
    (-> this (.getRegion))))

