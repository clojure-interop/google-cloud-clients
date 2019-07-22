(ns com.google.cloud.compute.v1.RouterStatusNatStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusNatStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterStatusNatStatus`

  returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^com.google.cloud.compute.v1.RouterStatusNatStatus prototype]
    (RouterStatusNatStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder []
    (RouterStatusNatStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterStatusNatStatus`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus []
    (RouterStatusNatStatus/getDefaultInstance )))

(defn get-num-vm-endpoints-with-nat-mappings
  "Number of VM endpoints (i.e., Nics) that can use NAT.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusNatStatus this]
    (-> this (.getNumVmEndpointsWithNatMappings))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusNatStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterStatusNatStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-auto-allocated-nat-ips-list
  "A list of IPs auto-allocated for NAT. Example: [\"1.1.1.1\", \"129.2.16.89\"]

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus this]
    (-> this (.getAutoAllocatedNatIpsList))))

(defn get-name
  "Unique name of this NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusNatStatus this]
    (-> this (.getName))))

(defn get-min-extra-nat-ips-needed
  "The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs are
   NOT enough to allow all configured VMs to use NAT. This value is meaningful only when
   auto-allocation of NAT IPs is *not* used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusNatStatus this]
    (-> this (.getMinExtraNatIpsNeeded))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterStatusNatStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterStatusNatStatus this]
    (-> this (.hashCode))))

(defn get-user-allocated-nat-ips-list
  "A list of IPs user-allocated for NAT. They will be raw IP strings like \"179.12.26.133\".

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus this]
    (-> this (.getUserAllocatedNatIpsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterStatusNatStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-user-allocated-nat-ip-resources-list
  "A list of fully qualified URLs of reserved IP address resources.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusNatStatus this]
    (-> this (.getUserAllocatedNatIpResourcesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterStatusNatStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusNatStatus$Builder [^RouterStatusNatStatus this]
    (-> this (.toBuilder))))

