(ns com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerVersion$Builder]))

(defn set-target-size
  "Specifies the intended number of instances to be created from the instanceTemplate. The final
   number of instances created from the template will be equal to: - If expressed as a fixed
   number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. -
   if expressed as a percent, the targetSize would be (targetSize.percent/100 *
   InstanceGroupManager.targetSize) If there is a remainder, the number is rounded up. If unset,
   this version will update any remaining instances not updated by another version. Read
   Starting a canary update for more information.

  target-size - `com.google.cloud.compute.v1.FixedOrPercent`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion$Builder this ^com.google.cloud.compute.v1.FixedOrPercent target-size]
    (-> this (.setTargetSize target-size))))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create new instances in the managed instance group until the
   `targetSize` for this version is reached.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerVersion$Builder this]
    (-> this (.getInstanceTemplate))))

(defn set-name
  "Name of the version. Unique among all versions in the scope of this managed instance group.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "Name of the version. Unique among all versions in the scope of this managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerVersion$Builder this]
    (-> this (.getName))))

(defn set-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create new instances in the managed instance group until the
   `targetSize` for this version is reached.

  instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion [^InstanceGroupManagerVersion$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagerVersion`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerVersion other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerVersion$Builder [^InstanceGroupManagerVersion$Builder this]
    (-> this (.clone))))

(defn get-target-size
  "Specifies the intended number of instances to be created from the instanceTemplate. The final
   number of instances created from the template will be equal to: - If expressed as a fixed
   number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. -
   if expressed as a percent, the targetSize would be (targetSize.percent/100 *
   InstanceGroupManager.targetSize) If there is a remainder, the number is rounded up. If unset,
   this version will update any remaining instances not updated by another version. Read
   Starting a canary update for more information.

  returns: `com.google.cloud.compute.v1.FixedOrPercent`"
  (^com.google.cloud.compute.v1.FixedOrPercent [^InstanceGroupManagerVersion$Builder this]
    (-> this (.getTargetSize))))

