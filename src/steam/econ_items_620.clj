(ns steam.econ-items-620 (:require [steam.request :as r]))

(def
 player-items
 "Parameters:
(uint64) :steamid - The Steam ID to fetch items for"
 (partial r/get "IEconItems_620" "GetPlayerItems" 1))

(def
 schema
 "Parameters:
(string) :language - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_620" "GetSchema" 1))
