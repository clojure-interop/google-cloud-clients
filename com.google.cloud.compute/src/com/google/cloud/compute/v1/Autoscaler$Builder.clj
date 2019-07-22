(ns com.google.cloud.compute.v1.Autoscaler$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Autoscaler$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URL of the region where the instance group resides (for autoscalers living in
   regional scope).

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#autoscaler for autoscalers.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the autoscaler configuration.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getStatus))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#autoscaler for autoscalers.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-status-details-list
  "[Output Only] Human-readable details about the current state of the autoscaler. Read the
   documentation for Commonly returned status messages for examples of status messages you might
   encounter.

  returns: `java.util.List<com.google.cloud.compute.v1.AutoscalerStatusDetails>`"
  (^java.util.List [^Autoscaler$Builder this]
    (-> this (.getStatusDetailsList))))

(defn build
  "returns: `com.google.cloud.compute.v1.Autoscaler`"
  (^com.google.cloud.compute.v1.Autoscaler [^Autoscaler$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getDescription))))

(defn set-autoscaling-policy
  "The configuration parameters for the autoscaling algorithm. You can define one or more of the
   policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   loadBalancingUtilization.

   If none of these are specified, the default will be to autoscale based on cpuUtilization
   to 0.6 or 60%.

  autoscaling-policy - `com.google.cloud.compute.v1.AutoscalingPolicy`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^com.google.cloud.compute.v1.AutoscalingPolicy autoscaling-policy]
    (-> this (.setAutoscalingPolicy autoscaling-policy))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Autoscaler`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^com.google.cloud.compute.v1.Autoscaler other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] URL of the zone where the instance group resides (for autoscalers living in
   zonal scope).

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the instance group resides (for autoscalers living in
   zonal scope).

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getZone))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this]
    (-> this (.clone))))

(defn get-autoscaling-policy
  "The configuration parameters for the autoscaling algorithm. You can define one or more of the
   policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   loadBalancingUtilization.

   If none of these are specified, the default will be to autoscale based on cpuUtilization
   to 0.6 or 60%.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy [^Autoscaler$Builder this]
    (-> this (.getAutoscalingPolicy))))

(defn get-target
  "URL of the managed instance group that this autoscaler will scale.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getTarget))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getCreationTimestamp))))

(defn add-all-status-details
  "[Output Only] Human-readable details about the current state of the autoscaler. Read the
   documentation for Commonly returned status messages for examples of status messages you might
   encounter.

  status-details - `java.util.List`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.util.List status-details]
    (-> this (.addAllStatusDetails status-details))))

(defn add-status-details
  "[Output Only] Human-readable details about the current state of the autoscaler. Read the
   documentation for Commonly returned status messages for examples of status messages you might
   encounter.

  status-details - `com.google.cloud.compute.v1.AutoscalerStatusDetails`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^com.google.cloud.compute.v1.AutoscalerStatusDetails status-details]
    (-> this (.addStatusDetails status-details))))

(defn set-target
  "URL of the managed instance group that this autoscaler will scale.

  target - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String target]
    (-> this (.setTarget target))))

(defn set-status
  "[Output Only] The status of the autoscaler configuration.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] URL of the region where the instance group resides (for autoscalers living in
   regional scope).

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler$Builder this]
    (-> this (.getRegion))))

