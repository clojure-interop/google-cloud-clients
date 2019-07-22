(ns com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyLoadBalancingUtilization]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder [^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization prototype]
    (AutoscalingPolicyLoadBalancingUtilization/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder []
    (AutoscalingPolicyLoadBalancingUtilization/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization []
    (AutoscalingPolicyLoadBalancingUtilization/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalingPolicyLoadBalancingUtilization this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.getFieldMask))))

(defn get-utilization-target
  "Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
   autoscaler should maintain. Must be a positive float value. If not defined, the default is 0.8.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.getUtilizationTarget))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization$Builder [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalingPolicyLoadBalancingUtilization this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalingPolicyLoadBalancingUtilization this]
    (-> this (.hashCode))))

