(ns com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerClient$ListDeviceRegistriesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPage>`"
  (^com.google.api.core.ApiFuture [^DeviceManagerClient$ListDeviceRegistriesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

