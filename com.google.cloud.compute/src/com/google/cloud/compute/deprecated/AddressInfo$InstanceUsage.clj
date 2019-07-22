(ns com.google.cloud.compute.deprecated.AddressInfo$InstanceUsage
  "Usage information for a Google Compute Engine region address assigned to a virtual machine
  instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$InstanceUsage]))

(defn get-instance
  "Returns the identity of the instance using the address.

  returns: `com.google.cloud.compute.deprecated.InstanceId`"
  (^com.google.cloud.compute.deprecated.InstanceId [^AddressInfo$InstanceUsage this]
    (-> this (.getInstance))))

(defn get-users
  "Description copied from class: AddressInfo.Usage

  returns: `java.util.List<com.google.cloud.compute.deprecated.InstanceId>`"
  (^java.util.List [^AddressInfo$InstanceUsage this]
    (-> this (.getUsers))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo$InstanceUsage this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressInfo$InstanceUsage this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressInfo$InstanceUsage this]
    (-> this (.hashCode))))

