(ns com.google.cloud.talent.v4beta1.EventServiceSettings$Builder
  "Builder for EventServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 EventServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder [^EventServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.talent.v4beta1.EventServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings$Builder [^EventServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-client-event-settings
  "Returns the builder for the settings used for calls to createClientEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EventServiceSettings$Builder this]
    (-> this (.createClientEventSettings))))

(defn build
  "returns: `com.google.cloud.talent.v4beta1.EventServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings [^EventServiceSettings$Builder this]
    (-> this (.build))))

