(ns com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMachineTypeRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder [^InstancesSetMachineTypeRequest$Builder this ^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest other]
    (-> this (.mergeFrom other))))

(defn get-machine-type
  "Full or partial URL of the machine type resource. See Machine Types for a full list of
   machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMachineTypeRequest$Builder this]
    (-> this (.getMachineType))))

(defn set-machine-type
  "Full or partial URL of the machine type resource. See Machine Types for a full list of
   machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1

  machine-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder [^InstancesSetMachineTypeRequest$Builder this ^java.lang.String machine-type]
    (-> this (.setMachineType machine-type))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest [^InstancesSetMachineTypeRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder [^InstancesSetMachineTypeRequest$Builder this]
    (-> this (.clone))))

