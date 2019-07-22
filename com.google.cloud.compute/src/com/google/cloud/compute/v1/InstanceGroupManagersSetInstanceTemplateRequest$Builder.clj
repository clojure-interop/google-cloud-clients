(ns com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersSetInstanceTemplateRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder [^InstanceGroupManagersSetInstanceTemplateRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest other]
    (-> this (.mergeFrom other))))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetInstanceTemplateRequest$Builder this]
    (-> this (.getInstanceTemplate))))

(defn set-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder [^InstanceGroupManagersSetInstanceTemplateRequest$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest [^InstanceGroupManagersSetInstanceTemplateRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest$Builder [^InstanceGroupManagersSetInstanceTemplateRequest$Builder this]
    (-> this (.clone))))

