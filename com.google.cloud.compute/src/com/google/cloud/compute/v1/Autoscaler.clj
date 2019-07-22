(ns com.google.cloud.compute.v1.Autoscaler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Autoscaler]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Autoscaler`

  returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^com.google.cloud.compute.v1.Autoscaler prototype]
    (Autoscaler/newBuilder prototype))
  (^com.google.cloud.compute.v1.Autoscaler$Builder []
    (Autoscaler/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Autoscaler`"
  (^com.google.cloud.compute.v1.Autoscaler []
    (Autoscaler/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#autoscaler for autoscalers.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the autoscaler configuration.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Autoscaler this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Autoscaler this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getName))))

(defn get-status-details-list
  "[Output Only] Human-readable details about the current state of the autoscaler. Read the
   documentation for Commonly returned status messages for examples of status messages you might
   encounter.

  returns: `java.util.List<com.google.cloud.compute.v1.AutoscalerStatusDetails>`"
  (^java.util.List [^Autoscaler this]
    (-> this (.getStatusDetailsList))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Autoscaler this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal
   scope).

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getZone))))

(defn get-autoscaling-policy
  "The configuration parameters for the autoscaling algorithm. You can define one or more of the
   policies for an autoscaler: cpuUtilization, customMetricUtilizations, and
   loadBalancingUtilization.

   If none of these are specified, the default will be to autoscale based on cpuUtilization to
   0.6 or 60%.

  returns: `com.google.cloud.compute.v1.AutoscalingPolicy`"
  (^com.google.cloud.compute.v1.AutoscalingPolicy [^Autoscaler this]
    (-> this (.getAutoscalingPolicy))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Autoscaler this]
    (-> this (.hashCode))))

(defn get-target
  "URL of the managed instance group that this autoscaler will scale.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getTarget))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Autoscaler this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the instance group resides (for autoscalers living in
   regional scope).

  returns: `java.lang.String`"
  (^java.lang.String [^Autoscaler this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Autoscaler$Builder`"
  (^com.google.cloud.compute.v1.Autoscaler$Builder [^Autoscaler this]
    (-> this (.toBuilder))))

