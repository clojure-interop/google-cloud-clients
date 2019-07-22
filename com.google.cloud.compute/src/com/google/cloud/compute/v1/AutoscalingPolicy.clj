(ns com.google.cloud.compute.v1.AutoscalingPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalingPolicy`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^com.google.cloud.compute.v1.AutoscalingPolicy prototype]
    (AutoscalingPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder []
    (AutoscalingPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicy`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy []
    (AutoscalingPolicy/getDefaultInstance )))

(defn get-min-num-replicas
  "The minimum number of replicas that the autoscaler can scale down to. This cannot be less than
   0. If not provided, autoscaler will choose a default value depending on maximum number of
   instances allowed.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy this]
    (-> this (.getMinNumReplicas))))

(defn get-load-balancing-utilization
  "Configuration parameters of autoscaling based on load balancer.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization [^AutoscalingPolicy this]
    (-> this (.getLoadBalancingUtilization))))

(defn get-cpu-utilization
  "Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU
   utilization of a managed instance group.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization [^AutoscalingPolicy this]
    (-> this (.getCpuUtilization))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalingPolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalingPolicy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalingPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalingPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-cool-down-period-sec
  "The number of seconds that the autoscaler should wait before it starts collecting information
   from a new instance. This prevents the autoscaler from collecting information when the instance
   is initializing, during which the collected usage would not be reliable. The default time
   autoscaler waits is 60 seconds.

   Virtual machine initialization times might vary because of numerous factors. We recommend
   that you test how long an instance may take to initialize. To do this, create an instance and
   time the startup process.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy this]
    (-> this (.getCoolDownPeriodSec))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalingPolicy this]
    (-> this (.hashCode))))

(defn get-max-num-replicas
  "The maximum number of instances that the autoscaler can scale up to. This is required when
   creating or updating an autoscaler. The maximum number of replicas should not be lower than
   minimal number of replicas.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy this]
    (-> this (.getMaxNumReplicas))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalingPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-custom-metric-utilizations-list
  "Configuration parameters of autoscaling based on a custom metric.

  returns: `java.util.List<com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization>`"
  (^java.util.List [^AutoscalingPolicy this]
    (-> this (.getCustomMetricUtilizationsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy this]
    (-> this (.toBuilder))))

