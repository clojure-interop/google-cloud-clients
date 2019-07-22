(ns com.google.cloud.compute.v1.InstanceGroupManagerVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerVersion]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerVersion`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerVersion prototype]
    (InstanceGroupManagerVersion/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder []
    (InstanceGroupManagerVersion/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion []
    (InstanceGroupManagerVersion/getDefaultInstance )))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create new instances in the managed instance group until the `targetSize`
   for this version is reached.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerVersion this]
    (-> this (.getInstanceTemplate))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerVersion this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerVersion this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerVersion this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the version. Unique among all versions in the scope of this managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerVersion this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerVersion this]
    (-> this (.getApiMessageRequestBody))))

(defn get-target-size
  "Specifies the intended number of instances to be created from the instanceTemplate. The final
   number of instances created from the template will be equal to: - If expressed as a fixed
   number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. - if
   expressed as a percent, the targetSize would be (targetSize.percent/100 *
   InstanceGroupManager.targetSize) If there is a remainder, the number is rounded up. If unset,
   this version will update any remaining instances not updated by another version. Read Starting
   a canary update for more information.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerVersion this]
    (-> this (.getTargetSize))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerVersion this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerVersion this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion this]
    (-> this (.toBuilder))))

