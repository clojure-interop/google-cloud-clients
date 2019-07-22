(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersSetTemplateRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder [^RegionInstanceGroupManagersSetTemplateRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest other]
    (-> this (.mergeFrom other))))

(defn get-instance-template
  "URL of the InstanceTemplate resource from which all new instances will be created.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTemplateRequest$Builder this]
    (-> this (.getInstanceTemplate))))

(defn set-instance-template
  "URL of the InstanceTemplate resource from which all new instances will be created.

  instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder [^RegionInstanceGroupManagersSetTemplateRequest$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest [^RegionInstanceGroupManagersSetTemplateRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest$Builder [^RegionInstanceGroupManagersSetTemplateRequest$Builder this]
    (-> this (.clone))))

