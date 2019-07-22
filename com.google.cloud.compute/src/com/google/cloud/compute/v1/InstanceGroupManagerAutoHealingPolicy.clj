(ns com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerAutoHealingPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy prototype]
    (InstanceGroupManagerAutoHealingPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder []
    (InstanceGroupManagerAutoHealingPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy []
    (InstanceGroupManagerAutoHealingPolicy/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.toString))))

(defn get-health-check
  "The URL for the health check that signals autohealing.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.getHealthCheck))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerAutoHealingPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.hashCode))))

(defn get-initial-delay-sec
  "The number of seconds that the managed instance group waits before it applies autohealing
   policies to new instances or recently recreated instances. This initial delay allows instances
   to initialize and run their startup scripts before the instance group determines that they are
   UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely.
   This value must be from range [0, 3600].

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.getInitialDelaySec))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerAutoHealingPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy$Builder [^InstanceGroupManagerAutoHealingPolicy this]
    (-> this (.toBuilder))))

