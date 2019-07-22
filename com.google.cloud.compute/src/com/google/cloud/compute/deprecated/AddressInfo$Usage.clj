(ns com.google.cloud.compute.deprecated.AddressInfo$Usage
  "Base class for a Google Compute Engine address's usage information. Implementations of this
  class represent different possible usages of a Compute Engine address. AddressInfo.InstanceUsage
  contains information for region addresses assigned to a Google Compute Engine instance. AddressInfo.RegionForwardingUsage contains information for region addresses assigned to one or more region
  forwarding rules. AddressInfo.GlobalForwardingUsage contains information for global addresses
  assigned to one or more global forwarding rules."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$Usage]))

(defn get-users
  "Returns the identities of resources currently using this address.

  returns: `java.util.List<? extends com.google.cloud.compute.deprecated.ResourceId>`"
  ([^AddressInfo$Usage this]
    (-> this (.getUsers))))

