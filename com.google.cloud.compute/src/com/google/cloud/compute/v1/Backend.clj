(ns com.google.cloud.compute.v1.Backend
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Backend]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Backend`

  returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^com.google.cloud.compute.v1.Backend prototype]
    (Backend/newBuilder prototype))
  (^com.google.cloud.compute.v1.Backend$Builder []
    (Backend/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Backend`"
  (^com.google.cloud.compute.v1.Backend []
    (Backend/getDefaultInstance )))

(defn get-balancing-mode
  "Specifies the balancing mode for this backend. For global HTTP(S) or TCP/SSL load balancing,
   the default is UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S)) and CONNECTION
   (for TCP/SSL).

   For Internal Load Balancing, the default and only supported mode is CONNECTION.

  returns: `java.lang.String`"
  (^java.lang.String [^Backend this]
    (-> this (.getBalancingMode))))

(defn get-max-rate
  "The max requests per second (RPS) of the group. Can be used with either RATE or UTILIZATION
   balancing modes, but required if RATE mode. For RATE mode, either maxRate or maxRatePerInstance
   must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend this]
    (-> this (.getMaxRate))))

(defn get-capacity-scaler
  "A multiplier applied to the group's maximum servicing capacity (based on UTILIZATION, RATE or
   CONNECTION). Default value is 1, which means the group will serve up to 100% of its configured
   capacity (depending on balancingMode). A setting of 0 means the group is completely drained,
   offering 0% of its available Capacity. Valid range is [0.0,1.0].

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend this]
    (-> this (.getCapacityScaler))))

(defn get-max-connections
  "The max number of simultaneous connections for the group. Can be used with either CONNECTION or
   UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerInstance must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend this]
    (-> this (.getMaxConnections))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Backend this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Backend this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Backend this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-max-connections-per-endpoint
  "The max number of simultaneous connections that a single backend network endpoint can handle.
   This is used to calculate the capacity of the group. Can be used in either CONNECTION or
   UTILIZATION balancing modes. For CONNECTION mode, either maxConnections or
   maxConnectionsPerEndpoint must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend this]
    (-> this (.getMaxConnectionsPerEndpoint))))

(defn get-max-utilization
  "Used when balancingMode is UTILIZATION. This ratio defines the CPU utilization target for the
   group. The default is 0.8. Valid range is [0.0, 1.0].

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend this]
    (-> this (.getMaxUtilization))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Backend this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Backend this]
    (-> this (.getApiMessageRequestBody))))

(defn get-max-rate-per-endpoint
  "The max requests per second (RPS) that a single backend network endpoint can handle. This is
   used to calculate the capacity of the group. Can be used in either balancing mode. For RATE
   mode, either maxRate or maxRatePerEndpoint must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend this]
    (-> this (.getMaxRatePerEndpoint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Backend this]
    (-> this (.hashCode))))

(defn get-max-rate-per-instance
  "The max requests per second (RPS) that a single backend instance can handle. This is used to
   calculate the capacity of the group. Can be used in either balancing mode. For RATE mode,
   either maxRate or maxRatePerInstance must be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Float`"
  (^java.lang.Float [^Backend this]
    (-> this (.getMaxRatePerInstance))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Backend this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-max-connections-per-instance
  "The max number of simultaneous connections that a single backend instance can handle. This is
   used to calculate the capacity of the group. Can be used in either CONNECTION or UTILIZATION
   balancing modes. For CONNECTION mode, either maxConnections or maxConnectionsPerInstance must
   be set.

   This cannot be used for internal load balancing.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Backend this]
    (-> this (.getMaxConnectionsPerInstance))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Backend$Builder`"
  (^com.google.cloud.compute.v1.Backend$Builder [^Backend this]
    (-> this (.toBuilder))))

(defn get-group
  "The fully-qualified URL of an Instance Group or Network Endpoint Group resource. In case of
   instance group this defines the list of instances that serve traffic. Member virtual machine
   instances from each instance group must live in the same zone as the instance group itself. No
   two backends in a backend service are allowed to use same Instance Group resource.

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
  (^java.lang.String [^Backend this]
    (-> this (.getGroup))))

