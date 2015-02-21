(ns steam.econ-items-730 (:require [steam.request :as r]))

(def
 player-items-v1
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_730" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v2
 "Parameters:
(string) :language - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_730" "GetSchema" 2))

(def schema schema-v2)

(def schema-url-v2 (partial r/get "IEconItems_730" "GetSchemaURL" 2))

(def schema-url schema-url-v2)

(def
 store-meta-data-v1
 "Parameters:
(string) :language - The language to results in. (optional)"
 (partial r/get "IEconItems_730" "GetStoreMetaData" 1))

(def store-meta-data store-meta-data-v1)
