(ns com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMachineResourcesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^InstancesSetMachineResourcesRequest$Builder this ^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest other]
    (-> this (.mergeFrom other))))

(defn get-guest-accelerators-list
  "A list of the type and count of accelerator cards attached to the instance.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>`"
  (^java.util.List [^InstancesSetMachineResourcesRequest$Builder this]
    (-> this (.getGuestAcceleratorsList))))

(defn add-all-guest-accelerators
  "A list of the type and count of accelerator cards attached to the instance.

  guest-accelerators - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^InstancesSetMachineResourcesRequest$Builder this ^java.util.List guest-accelerators]
    (-> this (.addAllGuestAccelerators guest-accelerators))))

(defn add-guest-accelerators
  "A list of the type and count of accelerator cards attached to the instance.

  guest-accelerators - `com.google.cloud.compute.v1.AcceleratorConfig`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^InstancesSetMachineResourcesRequest$Builder this ^com.google.cloud.compute.v1.AcceleratorConfig guest-accelerators]
    (-> this (.addGuestAccelerators guest-accelerators))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest [^InstancesSetMachineResourcesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^InstancesSetMachineResourcesRequest$Builder this]
    (-> this (.clone))))

