(ns com.google.cloud.compute.v1.Backend$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Backend$Builder]))

(defn get-balancing-mode
  "Specifies the balancing mode for this backend. For global HTTP(S) or TCP/SSL load balancing,
   the default is UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S)) and CONNECTION
   (for TCP/SSL).

   For Internal Load Balancing, the default and only supported mode is CONNECTION.

  returns: `java.lang.String`"
  (^java.lang.String [^Backend$Builder this]
    (-> this (.getBalancingMode))))

(defn get-max-rate
  "The max requests per second (RPS) of the group. Can be used with either RATE or UTILIZATION
   balancing modes, but required if RATE mode. For RATE mode, either maxRate or
   maxRatePerInstance must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend$Builder this]
    (-> this (.getMaxRate))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-capacity-scaler
  "A multiplier applied to the group's maximum servicing capacity (based on UTILIZATION, RATE or
   CONNECTION). Default value is 1, which means the group will serve up to 100% of its
   configured capacity (depending on balancingMode). A setting of 0 means the group is
   completely drained, offering 0% of its available Capacity. Valid range is [0.0,1.0].

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend$Builder this]
    (-> this (.getCapacityScaler))))

(defn set-max-connections
  "The max number of simultaneous connections for the group. Can be used with either CONNECTION
   or UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerInstance must be set.

   This cannot be used for internal load balancing.

  max-connections - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Integer max-connections]
    (-> this (.setMaxConnections max-connections))))

(defn set-max-connections-per-endpoint
  "The max number of simultaneous connections that a single backend network endpoint can handle.
   This is used to calculate the capacity of the group. Can be used in either CONNECTION or
   UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerEndpoint must be set.

   This cannot be used for internal load balancing.

  max-connections-per-endpoint - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Integer max-connections-per-endpoint]
    (-> this (.setMaxConnectionsPerEndpoint max-connections-per-endpoint))))

(defn get-max-connections
  "The max number of simultaneous connections for the group. Can be used with either CONNECTION
   or UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerInstance must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend$Builder this]
    (-> this (.getMaxConnections))))

(defn set-capacity-scaler
  "A multiplier applied to the group's maximum servicing capacity (based on UTILIZATION, RATE or
   CONNECTION). Default value is 1, which means the group will serve up to 100% of its
   configured capacity (depending on balancingMode). A setting of 0 means the group is
   completely drained, offering 0% of its available Capacity. Valid range is [0.0,1.0].

   This cannot be used for internal load balancing.

  capacity-scaler - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Float capacity-scaler]
    (-> this (.setCapacityScaler capacity-scaler))))

(defn set-group
  "The fully-qualified URL of an Instance Group or Network Endpoint Group resource. In case of
   instance group this defines the list of instances that serve traffic. Member virtual machine
   instances from each instance group must live in the same zone as the instance group itself.
   No two backends in a backend service are allowed to use same Instance Group resource.

   For Network Endpoint Groups this defines list of endpoints. All endpoints of Network
   Endpoint Group must be hosted on instances located in the same zone as the Network Endpoint
   Group.

   Backend service can not contain mix of Instance Group and Network Endpoint Group backends.

   Note that you must specify an Instance Group or Network Endpoint Group resource using the
   fully-qualified URL, rather than a partial URL.

   When the BackendService has load balancing scheme INTERNAL, the instance group must be
   within the same region as the BackendService. Network Endpoint Groups are not supported for
   INTERNAL load balancing scheme.

  group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.String group]
    (-> this (.setGroup group))))

(defn set-max-utilization
  "Used when balancingMode is UTILIZATION. This ratio defines the CPU utilization target for the
   group. The default is 0.8. Valid range is [0.0, 1.0].

   This cannot be used for internal load balancing.

  max-utilization - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Float max-utilization]
    (-> this (.setMaxUtilization max-utilization))))

(defn set-max-rate-per-instance
  "The max requests per second (RPS) that a single backend instance can handle. This is used to
   calculate the capacity of the group. Can be used in either balancing mode. For RATE mode,
   either maxRate or maxRatePerInstance must be set.

   This cannot be used for internal load balancing.

  max-rate-per-instance - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Float max-rate-per-instance]
    (-> this (.setMaxRatePerInstance max-rate-per-instance))))

(defn set-max-rate-per-endpoint
  "The max requests per second (RPS) that a single backend network endpoint can handle. This is
   used to calculate the capacity of the group. Can be used in either balancing mode. For RATE
   mode, either maxRate or maxRatePerEndpoint must be set.

   This cannot be used for internal load balancing.

  max-rate-per-endpoint - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Float max-rate-per-endpoint]
    (-> this (.setMaxRatePerEndpoint max-rate-per-endpoint))))

(defn set-balancing-mode
  "Specifies the balancing mode for this backend. For global HTTP(S) or TCP/SSL load balancing,
   the default is UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S)) and CONNECTION
   (for TCP/SSL).

   For Internal Load Balancing, the default and only supported mode is CONNECTION.

  balancing-mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.String balancing-mode]
    (-> this (.setBalancingMode balancing-mode))))

(defn get-max-connections-per-endpoint
  "The max number of simultaneous connections that a single backend network endpoint can handle.
   This is used to calculate the capacity of the group. Can be used in either CONNECTION or
   UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerEndpoint must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend$Builder this]
    (-> this (.getMaxConnectionsPerEndpoint))))

(defn get-max-utilization
  "Used when balancingMode is UTILIZATION. This ratio defines the CPU utilization target for the
   group. The default is 0.8. Valid range is [0.0, 1.0].

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend$Builder this]
    (-> this (.getMaxUtilization))))

(defn build
  "returns: `com.google.cloud.compute.v1.Backend`"
  (^com.google.cloud.compute.v1.Backend [^Backend$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Backend$Builder this]
    (-> this (.getDescription))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Backend`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^com.google.cloud.compute.v1.Backend other]
    (-> this (.mergeFrom other))))

(defn set-max-rate
  "The max requests per second (RPS) of the group. Can be used with either RATE or UTILIZATION
   balancing modes, but required if RATE mode. For RATE mode, either maxRate or
   maxRatePerInstance must be set.

   This cannot be used for internal load balancing.

  max-rate - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Integer max-rate]
    (-> this (.setMaxRate max-rate))))

(defn get-max-rate-per-endpoint
  "The max requests per second (RPS) that a single backend network endpoint can handle. This is
   used to calculate the capacity of the group. Can be used in either balancing mode. For RATE
   mode, either maxRate or maxRatePerEndpoint must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend$Builder this]
    (-> this (.getMaxRatePerEndpoint))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this]
    (-> this (.clone))))

(defn get-max-rate-per-instance
  "The max requests per second (RPS) that a single backend instance can handle. This is used to
   calculate the capacity of the group. Can be used in either balancing mode. For RATE mode,
   either maxRate or maxRatePerInstance must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend$Builder this]
    (-> this (.getMaxRatePerInstance))))

(defn set-max-connections-per-instance
  "The max number of simultaneous connections that a single backend instance can handle. This is
   used to calculate the capacity of the group. Can be used in either CONNECTION or UTILIZATION
   balancing modes. For CONNECTION mode, either maxConnections or maxConnectionsPerInstance must
   be set.

   This cannot be used for internal load balancing.

  max-connections-per-instance - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend$Builder this ^java.lang.Integer max-connections-per-instance]
    (-> this (.setMaxConnectionsPerInstance max-connections-per-instance))))

(defn get-max-connections-per-instance
  "The max number of simultaneous connections that a single backend instance can handle. This is
   used to calculate the capacity of the group. Can be used in either CONNECTION or UTILIZATION
   balancing modes. For CONNECTION mode, either maxConnections or maxConnectionsPerInstance must
   be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend$Builder this]
    (-> this (.getMaxConnectionsPerInstance))))

(defn get-group
  "The fully-qualified URL of an Instance Group or Network Endpoint Group resource. In case of
   instance group this defines the list of instances that serve traffic. Member virtual machine
   instances from each instance group must live in the same zone as the instance group itself.
   No two backends in a backend service are allowed to use same Instance Group resource.

   For Network Endpoint Groups this defines list of endpoints. All endpoints of Network
   Endpoint Group must be hosted on instances located in the same zone as the Network Endpoint
   Group.

   Backend service can not contain mix of Instance Group and Network Endpoint Group backends.

   Note that you must specify an Instance Group or Network Endpoint Group resource using the
   fully-qualified URL, rather than a partial URL.

   When the BackendService has load balancing scheme INTERNAL, the instance group must be
   within the same region as the BackendService. Network Endpoint Groups are not supported for
   INTERNAL load balancing scheme.

  returns: `java.lang.String`"
  (^java.lang.String [^Backend$Builder this]
    (-> this (.getGroup))))

