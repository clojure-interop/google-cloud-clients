(ns com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalingPolicyCpuUtilization$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder [^AutoscalingPolicyCpuUtilization$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization other]
    (-> this (.mergeFrom other))))

(defn get-utilization-target
  "The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   range (0, 1]. If not specified, the default is 0.6.

   If the CPU level is below the target utilization, the autoscaler scales down the number of
   instances until it reaches the minimum number of instances you specified or until the average
   CPU of your instances reaches the target utilization.

   If the average CPU is above the target utilization, the autoscaler scales up until it
   reaches the maximum number of instances you specified or until the average utilization
   reaches the target utilization.

  returns: `java.lang.Double`"
  (^java.lang.Double [^AutoscalingPolicyCpuUtilization$Builder this]
    (-> this (.getUtilizationTarget))))

(defn set-utilization-target
  "The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   range (0, 1]. If not specified, the default is 0.6.

   If the CPU level is below the target utilization, the autoscaler scales down the number of
   instances until it reaches the minimum number of instances you specified or until the average
   CPU of your instances reaches the target utilization.

   If the average CPU is above the target utilization, the autoscaler scales up until it
   reaches the maximum number of instances you specified or until the average utilization
   reaches the target utilization.

  utilization-target - `java.lang.Double`

  returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder [^AutoscalingPolicyCpuUtilization$Builder this ^java.lang.Double utilization-target]
    (-> this (.setUtilizationTarget utilization-target))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization [^AutoscalingPolicyCpuUtilization$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder`"
  (^com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization$Builder [^AutoscalingPolicyCpuUtilization$Builder this]
    (-> this (.clone))))

