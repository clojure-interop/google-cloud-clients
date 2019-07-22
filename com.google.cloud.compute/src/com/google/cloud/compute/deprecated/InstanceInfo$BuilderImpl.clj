(ns com.google.cloud.compute.deprecated.InstanceInfo$BuilderImpl
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated InstanceInfo$BuilderImpl]))

(defn set-description
  "Description copied from class: InstanceInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-can-ip-forward
  "Description copied from class: InstanceInfo.Builder

  can-ip-forward - `java.lang.Boolean`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^java.lang.Boolean can-ip-forward]
    (-> this (.setCanIpForward can-ip-forward))))

(defn set-service-accounts
  "Description copied from class: InstanceInfo.Builder

  service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^java.util.List service-accounts]
    (-> this (.setServiceAccounts service-accounts))))

(defn set-attached-disks
  "Description copied from class: InstanceInfo.Builder

  attached-disks - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^java.util.List attached-disks]
    (-> this (.setAttachedDisks attached-disks))))

(defn set-instance-id
  "Description copied from class: InstanceInfo.Builder

  instance-id - `com.google.cloud.compute.deprecated.InstanceId`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^com.google.cloud.compute.deprecated.InstanceId instance-id]
    (-> this (.setInstanceId instance-id))))

(defn build
  "Description copied from class: InstanceInfo.Builder

  returns: `com.google.cloud.compute.deprecated.InstanceInfo`"
  (^com.google.cloud.compute.deprecated.InstanceInfo [^InstanceInfo$BuilderImpl this]
    (-> this (.build))))

(defn set-tags
  "Description copied from class: InstanceInfo.Builder

  tags - `com.google.cloud.compute.deprecated.Tags`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^com.google.cloud.compute.deprecated.Tags tags]
    (-> this (.setTags tags))))

(defn set-machine-type
  "Description copied from class: InstanceInfo.Builder

  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^com.google.cloud.compute.deprecated.MachineTypeId machine-type]
    (-> this (.setMachineType machine-type))))

(defn set-scheduling-options
  "Description copied from class: InstanceInfo.Builder

  scheduling-options - `com.google.cloud.compute.deprecated.SchedulingOptions`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^com.google.cloud.compute.deprecated.SchedulingOptions scheduling-options]
    (-> this (.setSchedulingOptions scheduling-options))))

(defn set-metadata
  "Description copied from class: InstanceInfo.Builder

  metadata - `com.google.cloud.compute.deprecated.Metadata`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^com.google.cloud.compute.deprecated.Metadata metadata]
    (-> this (.setMetadata metadata))))

(defn set-network-interfaces
  "Description copied from class: InstanceInfo.Builder

  network-interfaces - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$BuilderImpl this ^java.util.List network-interfaces]
    (-> this (.setNetworkInterfaces network-interfaces))))

