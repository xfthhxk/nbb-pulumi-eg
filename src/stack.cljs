(ns stack
  (:require ["@pulumi/random" :as random]
            [pulumi-cljs.core :as p :refer [defresource]]))

(defresource user-id
  random/RandomId
  {:byteLength 32})


(defresource other-id
  random/RandomId
  {:byteLength 16})

(defn outputs
  []
 #js {:user-id (.-id user-id)
      :other-id (.-id other-id)})
