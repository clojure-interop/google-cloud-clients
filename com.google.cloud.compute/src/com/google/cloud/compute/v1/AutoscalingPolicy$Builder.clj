(ns com.google.cloud.compute.v1.AutoscalingPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicy$Builder]))

(defn add-custom-metric-utilizations
  "Configuration parameters of autoscaling based on a custom metric.

  custom-metric-utilizations - `com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom-metric-utilizations]
    (-> this (.addCustomMetricUtilizations custom-metric-utilizations))))

(defn set-max-num-replicas
  "The maximum number of instances that the autoscaler can scale up to. This is required when
   creating or updating an autoscaler. The maximum number of replicas should not be lower than
   minimal number of replicas.

  max-num-replicas - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^java.lang.Integer max-num-replicas]
    (-> this (.setMaxNumReplicas max-num-replicas))))

(defn get-min-num-replicas
  "The minimum number of replicas that the autoscaler can scale down to. This cannot be less
   than 0. If not provided, autoscaler will choose a default value depending on maximum number
   of instances allowed.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy$Builder this]
    (-> this (.getMinNumReplicas))))

(defn set-load-balancing-utilization
  "Configuration parameters of autoscaling based on load balancer.

  load-balancing-utilization - `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization load-balancing-utilization]
    (-> this (.setLoadBalancingUtilization load-balancing-utilization))))

(defn get-load-balancing-utilization
  "Configuration parameters of autoscaling based on load balancer.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization [^AutoscalingPolicy$Builder this]
    (-> this (.getLoadBalancingUtilization))))

(defn get-cpu-utilization
  "Defines the CPU utilization policy that allows the autoscaler to scale based on the average
   CPU utilization of a managed instance group.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization [^AutoscalingPolicy$Builder this]
    (-> this (.getCpuUtilization))))

(defn add-all-custom-metric-utilizations
  "Configuration parameters of autoscaling based on a custom metric.

  custom-metric-utilizations - `java.util.List`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^java.util.List custom-metric-utilizations]
    (-> this (.addAllCustomMetricUtilizations custom-metric-utilizations))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicy`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy [^AutoscalingPolicy$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalingPolicy`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicy other]
    (-> this (.mergeFrom other))))

(defn set-min-num-replicas
  "The minimum number of replicas that the autoscaler can scale down to. This cannot be less
   than 0. If not provided, autoscaler will choose a default value depending on maximum number
   of instances allowed.

  min-num-replicas - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^java.lang.Integer min-num-replicas]
    (-> this (.setMinNumReplicas min-num-replicas))))

(defn get-cool-down-period-sec
  "The number of seconds that the autoscaler should wait before it starts collecting information
   from a new instance. This prevents the autoscaler from collecting information when the
   instance is initializing, during which the collected usage would not be reliable. The default
   time autoscaler waits is 60 seconds.

   Virtual machine initialization times might vary because of numerous factors. We recommend
   that you test how long an instance may take to initialize. To do this, create an instance and
   time the startup process.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy$Builder this]
    (-> this (.getCoolDownPeriodSec))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this]
    (-> this (.clone))))

(defn set-cpu-utilization
  "Defines the CPU utilization policy that allows the autoscaler to scale based on the average
   CPU utilization of a managed instance group.

  cpu-utilization - `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization cpu-utilization]
    (-> this (.setCpuUtilization cpu-utilization))))

(defn get-max-num-replicas
  "The maximum number of instances that the autoscaler can scale up to. This is required when
   creating or updating an autoscaler. The maximum number of replicas should not be lower than
   minimal number of replicas.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AutoscalingPolicy$Builder this]
    (-> this (.getMaxNumReplicas))))

(defn get-custom-metric-utilizations-list
  "Configuration parameters of autoscaling based on a custom metric.

  returns: `java.util.List<com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization>`"
  (^java.util.List [^AutoscalingPolicy$Builder this]
    (-> this (.getCustomMetricUtilizationsList))))

(defn set-cool-down-period-sec
  "The number of seconds that the autoscaler should wait before it starts collecting information
   from a new instance. This prevents the autoscaler from collecting information when the
   instance is initializing, during which the collected usage would not be reliable. The default
   time autoscaler waits is 60 seconds.

   Virtual machine initialization times might vary because of numerous factors. We recommend
   that you test how long an instance may take to initialize. To do this, create an instance and
   time the startup process.

  cool-down-period-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy$Builder [^AutoscalingPolicy$Builder this ^java.lang.Integer cool-down-period-sec]
    (-> this (.setCoolDownPeriodSec cool-down-period-sec))))

