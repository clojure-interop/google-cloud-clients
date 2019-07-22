(ns com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerClient$ListDevicesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPage>`"
  (^com.google.api.core.ApiFuture [^DeviceManagerClient$ListDevicesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

