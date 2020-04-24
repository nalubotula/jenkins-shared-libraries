package org.nalubotula
def checkOutFrom(repo) {
  git url: "https://github.com/nalubotula:${repo}"
}

return this