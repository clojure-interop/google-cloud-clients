(ns com.google.cloud.compute.v1.ResourceCommitment$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ResourceCommitment$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ResourceCommitment`

  returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^ResourceCommitment$Builder this ^com.google.cloud.compute.v1.ResourceCommitment other]
    (-> this (.mergeFrom other))))

(defn get-amount
  "The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs,
   this can just be an integer. For memory, this must be provided in MB. Memory must be a
   multiple of 256 MB, with up to 6.5GB of memory per every vCPU.

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceCommitment$Builder this]
    (-> this (.getAmount))))

(defn set-amount
  "The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs,
   this can just be an integer. For memory, this must be provided in MB. Memory must be a
   multiple of 256 MB, with up to 6.5GB of memory per every vCPU.

  amount - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^ResourceCommitment$Builder this ^java.lang.String amount]
    (-> this (.setAmount amount))))

(defn get-type
  "Type of resource for which this commitment applies. Possible values are VCPU and MEMORY

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceCommitment$Builder this]
    (-> this (.getType))))

(defn set-type
  "Type of resource for which this commitment applies. Possible values are VCPU and MEMORY

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^ResourceCommitment$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.compute.v1.ResourceCommitment`"
  (^com.google.cloud.compute.v1.ResourceCommitment [^ResourceCommitment$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ResourceCommitment$Builder`"
  (^com.google.cloud.compute.v1.ResourceCommitment$Builder [^ResourceCommitment$Builder this]
    (-> this (.clone))))

