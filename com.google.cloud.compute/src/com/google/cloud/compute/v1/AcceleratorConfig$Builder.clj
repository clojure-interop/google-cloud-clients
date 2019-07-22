(ns com.google.cloud.compute.v1.AcceleratorConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AcceleratorConfig`

  returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^AcceleratorConfig$Builder this ^com.google.cloud.compute.v1.AcceleratorConfig other]
    (-> this (.mergeFrom other))))

(defn get-accelerator-count
  "The number of the guest accelerator cards exposed to this instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AcceleratorConfig$Builder this]
    (-> this (.getAcceleratorCount))))

(defn set-accelerator-count
  "The number of the guest accelerator cards exposed to this instance.

  accelerator-count - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^AcceleratorConfig$Builder this ^java.lang.Integer accelerator-count]
    (-> this (.setAcceleratorCount accelerator-count))))

(defn get-accelerator-type
  "Full or partial URL of the accelerator type resource to attach to this instance. For example:
   projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are
   creating an instance template, specify only the accelerator name. See GPUs on Compute Engine
   for a full list of accelerator types.

  returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorConfig$Builder this]
    (-> this (.getAcceleratorType))))

(defn set-accelerator-type
  "Full or partial URL of the accelerator type resource to attach to this instance. For example:
   projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are
   creating an instance template, specify only the accelerator name. See GPUs on Compute Engine
   for a full list of accelerator types.

  accelerator-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^AcceleratorConfig$Builder this ^java.lang.String accelerator-type]
    (-> this (.setAcceleratorType accelerator-type))))

(defn build
  "returns: `com.google.cloud.compute.v1.AcceleratorConfig`"
  (^com.google.cloud.compute.v1.AcceleratorConfig [^AcceleratorConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AcceleratorConfig$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorConfig$Builder [^AcceleratorConfig$Builder this]
    (-> this (.clone))))

